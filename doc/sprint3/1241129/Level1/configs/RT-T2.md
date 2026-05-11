# <span style="color: #E67E22">RT-T2 Configuration</span>

**Type:** Router (Cisco 2811)  
**Terminal:** T2  
**Role:** Terminal router — inter-VLAN routing, campus backbone, internet connection, DHCP, VoIP, NAT, firewall

---

## <span style="color: #1F4E79">Running Configuration</span>

Run: **show running-config** after running **wr**

```cisco

Current configuration : 5239 bytes
!
version 15.1
no service timestamps log datetime msec
no service timestamps debug datetime msec
service password-encryption
!
hostname RT-T2
!
!
!
enable secret 5 $1$mERr$UIEd/gKB8Xu9v11aSkZ1n0
!
!
ip dhcp excluded-address 10.76.160.1
ip dhcp excluded-address 10.76.168.1
ip dhcp excluded-address 10.76.172.1
ip dhcp excluded-address 10.76.174.1 10.76.174.3
!
ip dhcp pool T2_WIFI
 network 10.76.160.0 255.255.248.0
 default-router 10.76.160.1
 dns-server 10.76.174.3
 domain-name rcomp-25-26-DI-G4
ip dhcp pool T2_USERS
 network 10.76.168.0 255.255.252.0
 default-router 10.76.168.1
 dns-server 10.76.174.3
 domain-name rcomp-25-26-DI-G4
ip dhcp pool T2_VOIP
 network 10.76.172.0 255.255.254.0
 default-router 10.76.172.1
 option 150 ip 10.76.172.1
 dns-server 10.76.174.3
 domain-name rcomp-25-26-DI-G4
!
!
!
ip cef
no ipv6 cef
!
!
!
username cisco privilege 15 secret 5 $1$mERr$UIEd/gKB8Xu9v11aSkZ1n0
!
!
license udi pid CISCO2811/K9 sn FTX1017EQ05-
!
!
!
!
!
!
!
!
!
!
!
ip ssh version 2
ip domain-name rc2526dig4
!
!
spanning-tree mode pvst
!
!
!
!
!
!
interface FastEthernet0/0
 no ip address
 duplex auto
 speed auto
!
interface FastEthernet0/0.799
 encapsulation dot1Q 799
 ip address 10.76.210.1 255.255.255.0
 ip nat outside
 ip access-group BACKBONE_IN in
!
interface FastEthernet0/0.801
 encapsulation dot1Q 801
 ip address 10.76.168.1 255.255.252.0
 ip nat inside
 ip access-group LOCAL_IN in
!
interface FastEthernet0/0.802
 encapsulation dot1Q 802
 ip address 10.76.160.1 255.255.248.0
 ip nat inside
 ip access-group LOCAL_IN in
!
interface FastEthernet0/0.803
 encapsulation dot1Q 803
 ip address 10.76.172.1 255.255.254.0
 ip nat inside
 ip access-group LOCAL_IN in
!
interface FastEthernet0/0.804
 encapsulation dot1Q 804
 ip address 10.76.174.1 255.255.255.128
 ip nat inside
 ip access-group LOCAL_IN in
 ip access-group DMZ_IN out
!
interface FastEthernet0/1
 description Connection to ISP-Router
 ip address 89.73.67.237 255.255.255.252
 duplex auto
 speed auto
!
interface Vlan1
 no ip address
 shutdown
!
router ospf 1
 log-adjacency-changes
 network 10.76.160.0 0.0.7.255 area 2
 network 10.76.168.0 0.0.3.255 area 2
 network 10.76.172.0 0.0.1.255 area 2
 network 10.76.174.0 0.0.0.127 area 2
 network 10.76.210.0 0.0.0.255 area 0
 default-information originate
!
ip nat inside source static tcp 10.76.174.3 80 10.76.210.1 80 
ip nat inside source static tcp 10.76.174.3 443 10.76.210.1 443 
ip classless
ip route 0.0.0.0 0.0.0.0 89.73.67.238 
!
ip flow-export version 9
!
!
ip access-list extended BACKBONE_IN
 deny ip 10.76.128.0 0.0.127.255 any
 permit icmp any any echo
 permit icmp any any echo-reply
 permit ospf any any
 permit tcp any host 10.76.210.1 eq www
 permit tcp any host 10.76.210.1 eq 443
 permit tcp any any established
 permit ip any any
ip access-list extended DMZ_IN
 permit udp any host 10.76.174.3 eq domain
 permit tcp any host 10.76.174.3 eq domain
 permit tcp any host 10.76.174.3 eq www
 permit tcp any host 10.76.174.3 eq 443
 permit tcp any host 10.76.174.2 eq www
 permit tcp any host 10.76.174.2 eq 443
 deny ip any 10.76.174.0 0.0.0.127
 permit ip any any
 permit icmp 10.76.174.0 0.0.0.127 any echo-reply
ip access-list extended LOCAL_IN
 permit icmp any any echo
 permit icmp any any echo-reply
 deny ip any 10.76.210.0 0.0.0.255
 permit udp host 0.0.0.0 host 255.255.255.255 eq bootps
 permit ospf any any
 permit udp any any eq tftp
 permit tcp any any eq 2000
 permit udp any any eq 2000
 permit udp any host 10.76.174.3 eq domain
 permit tcp any host 10.76.174.3 eq domain
 deny ip any host 10.76.160.1
 deny ip any host 10.76.168.1
 deny ip any host 10.76.172.1
 deny ip any host 10.76.174.1
 deny ip any host 10.76.210.1
 permit ip any any
!
banner motd ^C
####################################################################################
### +--------------------------------------------------------------------------+ ###
### |                       RCOMP NETWORK INFRASTRUCTURE                       | ###
### |                                  GROUP 4                                 | ###
### |                    ------------------------------------                  | ###
### |             !!! UNAUTHORIZED ACCESS IS STRICTLY PROHIBITED !!!           | ###
### |                                                                          | ###
### |                                                                          | ###
### |               All access attempts are monitored and logged.              | ###
### |            Unauthorized use may result in disciplinary measures.         | ###
### +--------------------------------------------------------------------------+ ###
####################################################################################
^C
!
!
!
!
telephony-service
 max-ephones 5
 max-dn 10
 ip source-address 10.76.172.1 port 2000
 auto assign 1 to 10
!
ephone-dn 1
 number 2001
!
ephone-dn 2
 number 2002
!
ephone 3
 device-security-mode none
 mac-address 0001.C799.A619
 type 7960
 button 1:1
!
ephone 4
 device-security-mode none
 mac-address 0060.47BC.36A7
 type 7960
 button 1:2
!
line con 0
 login local
!
line aux 0
!
line vty 0 4
 login local
 transport input ssh
line vty 5 15
 login local
 transport input ssh
!
!
!
end


```

---

## IP Routing Table

Run: **show ip route**

```cisco

RT-T2#show ip route
Codes: L - local, C - connected, S - static, R - RIP, M - mobile, B - BGP
       D - EIGRP, EX - EIGRP external, O - OSPF, IA - OSPF inter area
       N1 - OSPF NSSA external type 1, N2 - OSPF NSSA external type 2
       E1 - OSPF external type 1, E2 - OSPF external type 2, E - EGP
       i - IS-IS, L1 - IS-IS level-1, L2 - IS-IS level-2, ia - IS-IS inter area
       * - candidate default, U - per-user static route, o - ODR
       P - periodic downloaded static route

Gateway of last resort is 89.73.67.238 to network 0.0.0.0

     10.0.0.0/8 is variably subnetted, 10 subnets, 6 masks
C       10.76.160.0/21 is directly connected, FastEthernet0/0.802
L       10.76.160.1/32 is directly connected, FastEthernet0/0.802
C       10.76.168.0/22 is directly connected, FastEthernet0/0.801
L       10.76.168.1/32 is directly connected, FastEthernet0/0.801
C       10.76.172.0/23 is directly connected, FastEthernet0/0.803
L       10.76.172.1/32 is directly connected, FastEthernet0/0.803
C       10.76.174.0/25 is directly connected, FastEthernet0/0.804
L       10.76.174.1/32 is directly connected, FastEthernet0/0.804
C       10.76.210.0/24 is directly connected, FastEthernet0/0.799
L       10.76.210.1/32 is directly connected, FastEthernet0/0.799
     89.0.0.0/8 is variably subnetted, 2 subnets, 2 masks
C       89.73.67.236/30 is directly connected, FastEthernet0/1
L       89.73.67.237/32 is directly connected, FastEthernet0/1
S*   0.0.0.0/0 [1/0] via 89.73.67.238

```

---

## IP Interfaces

Run: **show ip interface brief**

```cisco

Interface              IP-Address      OK? Method Status                Protocol 
FastEthernet0/0        unassigned      YES unset  up                    up 
FastEthernet0/0.799    10.76.210.1     YES manual up                    up 
FastEthernet0/0.801    10.76.168.1     YES manual up                    up 
FastEthernet0/0.802    10.76.160.1     YES manual up                    up 
FastEthernet0/0.803    10.76.172.1     YES manual up                    up 
FastEthernet0/0.804    10.76.174.1     YES manual up                    up 
FastEthernet0/1        89.73.67.237    YES manual up                    up 
Vlan1                  unassigned      YES unset  administratively down down

```

---

## OSPF Neighbors

Run: **show ip ospf neighbor**

```cisco

Meter aqui depois de juntar tudo no campus.pkt

```

---

## NAT Translations

Run: **show ip nat translations**

```cisco

Pro  Inside global     Inside local       Outside local      Outside global
tcp 10.76.210.1:443    10.76.174.3:443    ---                ---
tcp 10.76.210.1:80     10.76.174.3:80     ---                ---

```

---

## Ephone Status

Run: **show ephone**

```cisco

ephone-3 Mac:0001.C799.A619 TCP socket:[1] activeLine:0 REGISTERED in SCCP ver 12 and Server in ver 8
mediaActive:0 offhook:0 ringing:0 reset:0 reset_sent:0 paging 0 debug:0 caps:8
IP:10.76.172.4 1088 7960   keepalive 43 max_line 2
 button 1: dn 1  number 2001 CH1   IDLE

ephone-4 Mac:0060.47BC.36A7 TCP socket:[1] activeLine:0 REGISTERED in SCCP ver 12 and Server in ver 8
mediaActive:0 offhook:0 ringing:0 reset:0 reset_sent:0 paging 0 debug:0 caps:8
IP:10.76.172.5 1080 7960   keepalive 43 max_line 2
 button 1: dn 2  number 2002 CH1   IDLE

```

---

## DHCP Bindings

Run: **show ip dhcp binding**

```cisco

IP address       Client-ID/              Lease expiration        Type
                 Hardware address
10.76.168.2      0001.43C6.942A           --                     Automatic
10.76.172.3      0007.EC14.2CE9           --                     Automatic
10.76.172.2      0060.5CEA.51AB           --                     Automatic
10.76.172.4      0001.C799.A619           --                     Automatic
10.76.172.5      0060.47BC.36A7           --                     Automatic

```

---

## Notes

- **Backbone IP:** 10.76.210.1/24 (FastEthernet0/0.799)
- **Subinterfaces configured:**
  - Fa0/0.799 → CAMPUS_BACKBONE → 10.76.210.1/24 (NAT outside, BACKBONE_IN ACL inbound)
  - Fa0/0.801 → T2_USERS → 10.76.168.1/22 (NAT inside, LOCAL_IN ACL inbound)
  - Fa0/0.802 → T2_WIFI → 10.76.160.1/21 (NAT inside, LOCAL_IN ACL inbound)
  - Fa0/0.803 → T2_VOIP → 10.76.172.1/23 (NAT inside, LOCAL_IN ACL inbound)
  - Fa0/0.804 → T2_SERVERS → 10.76.174.1/25 (NAT inside, LOCAL_IN ACL inbound, DMZ_IN ACL outbound)
- **WAN IP:** 89.73.67.237/30 (FastEthernet0/1 → ISP-Router)
- **Default route:** 0.0.0.0/0 via 89.73.67.238 (ISP), redistribuída via OSPF com default-information originate
- **OSPF:** process 1, area 0 (backbone 10.76.210.0/24), area 2 (redes T2)
- **DHCP pools:** T2_WIFI, T2_USERS, T2_VOIP (com option 150 → 10.76.172.1)
- **NAT estático:** HTTP/HTTPS redirecionado de 10.76.210.1 para SRV2 (10.76.174.3)
- **VoIP:** telephony-service ativo, ephone-dn 1 (2001) e ephone-dn 2 (2002), 2 telefones registados
- **Connected to switch:** IC-L1-T2 via Fa0/0 (trunk)