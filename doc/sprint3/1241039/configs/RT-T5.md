# <span style="color: #E67E22">RT-T5 Configuration</span>

---

## <span style="color: #1F4E79">Running Configuration</span>

Run: **show running-config** after running **wr**

```cisco

!
version 15.1
no service timestamps log datetime msec
no service timestamps debug datetime msec
service password-encryption
!
hostname RT-T5
!
!
!
enable secret 5 $1$mERr$UIEd/gKB8Xu9v11aSkZ1n0
!
!
ip dhcp excluded-address 10.76.128.1
ip dhcp excluded-address 10.76.144.1
ip dhcp excluded-address 10.76.152.1
!
ip dhcp pool T5_WIFI
 network 10.76.128.0 255.255.240.0
 default-router 10.76.128.1
 dns-server 10.76.154.3
 domain-name terminal-5.rcomp-25-26-DI-G4
ip dhcp pool T5_USERS
 network 10.76.144.0 255.255.248.0
 default-router 10.76.144.1
 dns-server 10.76.154.3
 domain-name terminal-5.rcomp-25-26-DI-G4
ip dhcp pool T5_VOIP
 network 10.76.152.0 255.255.254.0
 default-router 10.76.152.1
 option 150 ip 10.76.152.1
 dns-server 10.76.154.3
 domain-name terminal-5.rcomp-25-26-DI-G4
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
license udi pid CISCO2811/K9 sn FTX10173E1H-
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
interface FastEthernet0/0.813
 encapsulation dot1Q 813
 ip address 10.76.144.1 255.255.248.0
 ip nat inside
 ip access-group LOCAL_IN in
!
interface FastEthernet0/0.814
 encapsulation dot1Q 814
 ip address 10.76.128.1 255.255.240.0
 ip nat inside
 ip access-group LOCAL_IN in
!
interface FastEthernet0/0.815
 encapsulation dot1Q 815
 ip address 10.76.152.1 255.255.254.0
 ip nat inside
 ip access-group LOCAL_IN in
!
interface FastEthernet0/0.816
 encapsulation dot1Q 816
 ip address 10.76.154.1 255.255.255.0
 ip nat inside
 ip access-group LOCAL_IN in
 ip access-group DMZ_IN out
!
interface FastEthernet0/1
 ip address 10.76.210.4 255.255.255.0
 ip nat outside
 ip access-group BACKBONE_IN in
 duplex auto
 speed auto
!
interface Vlan1
 no ip address
 shutdown
!
router ospf 1
 log-adjacency-changes
 network 10.76.128.0 0.0.15.255 area 5
 network 10.76.144.0 0.0.7.255 area 5
 network 10.76.152.0 0.0.1.255 area 5
 network 10.76.154.0 0.0.0.255 area 5
 network 10.76.210.0 0.0.0.255 area 0
!
ip nat inside source static tcp 10.76.154.3 80 10.76.210.4 80 
ip nat inside source static tcp 10.76.154.3 443 10.76.210.4 443 
ip classless
!
ip flow-export version 9
!
!
ip access-list extended BACKBONE_IN
 deny ip 10.76.128.0 0.0.127.255 any
 permit icmp any any echo
 permit icmp any any echo-reply
 permit ospf any any
 permit tcp any host 10.76.210.4 eq www
 permit tcp any host 10.76.210.4 eq 443
 permit tcp any any established
 permit ip any any
ip access-list extended DMZ_IN
 permit udp any host 10.76.154.3 eq domain
 permit tcp any host 10.76.154.3 eq domain
 permit tcp any host 10.76.154.3 eq www
 permit tcp any host 10.76.154.3 eq 443
 permit tcp any host 10.76.154.2 eq www
 permit tcp any host 10.76.154.2 eq 443
 permit icmp any 10.76.154.0 0.0.0.255 echo
 permit icmp any 10.76.154.0 0.0.0.255 echo-reply
 deny ip any 10.76.154.0 0.0.0.255
 permit ip any any
ip access-list extended LOCAL_IN
 permit icmp any any echo
 permit icmp any any echo-reply
 deny ip any 10.76.210.0 0.0.0.255
 permit udp host 0.0.0.0 host 255.255.255.255 eq bootps
 permit ospf any any
 permit udp any any eq tftp
 permit tcp any any eq 2000
 permit udp any any eq 2000
 permit udp any host 10.76.154.3 eq domain
 permit tcp any host 10.76.154.3 eq domain
 deny ip any host 10.76.128.1
 deny ip any host 10.76.144.1
 deny ip any host 10.76.152.1
 deny ip any host 10.76.154.1
 deny ip any host 10.76.210.4
 permit ip any any
!
banner motd $
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
$
!
!
!
!
telephony-service
 max-ephones 5
 max-dn 10
 ip source-address 10.76.152.1 port 2000
 auto assign 1 to 10
!
ephone-dn 1
 number 5001
!
ephone-dn 2
 number 5002
!
ephone 1
 device-security-mode none
 mac-address 00D0.D3E8.7ECB
 type 7960
 button 1:1
!
ephone 2
 device-security-mode none
 mac-address 0007.EC32.6B6D
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
!
!
!
end




```

---

## IP Routing Table

Run: **show ip route**

```cisco

Codes: L - local, C - connected, S - static, R - RIP, M - mobile, B - BGP
       D - EIGRP, EX - EIGRP external, O - OSPF, IA - OSPF inter area
       N1 - OSPF NSSA external type 1, N2 - OSPF NSSA external type 2
       E1 - OSPF external type 1, E2 - OSPF external type 2, E - EGP
       i - IS-IS, L1 - IS-IS level-1, L2 - IS-IS level-2, ia - IS-IS inter area
       * - candidate default, U - per-user static route, o - ODR
       P - periodic downloaded static route

Gateway of last resort is not set

     10.0.0.0/8 is variably subnetted, 8 subnets, 5 masks
C       10.76.128.0/20 is directly connected, FastEthernet0/0.814
L       10.76.128.1/32 is directly connected, FastEthernet0/0.814
C       10.76.144.0/21 is directly connected, FastEthernet0/0.813
L       10.76.144.1/32 is directly connected, FastEthernet0/0.813
C       10.76.152.0/23 is directly connected, FastEthernet0/0.815
L       10.76.152.1/32 is directly connected, FastEthernet0/0.815
C       10.76.154.0/24 is directly connected, FastEthernet0/0.816
L       10.76.154.1/32 is directly connected, FastEthernet0/0.816

```

---

## IP Interfaces

Run: **show ip interface brief**

```cisco

Interface              IP-Address      OK? Method Status                Protocol 
FastEthernet0/0        unassigned      YES unset  up                    up 
FastEthernet0/0.813    10.76.144.1     YES manual up                    up 
FastEthernet0/0.814    10.76.128.1     YES manual up                    up 
FastEthernet0/0.815    10.76.152.1     YES manual up                    up 
FastEthernet0/0.816    10.76.154.1     YES manual up                    up 
FastEthernet0/1        10.76.210.4     YES manual down                  down 
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
tcp 10.76.210.4:443    10.76.154.3:443    ---                ---
tcp 10.76.210.4:80     10.76.154.3:80     ---                ---
```

---

## Ephone Status

Run: **show ephone**

```cisco

ephone-1 Mac:00D0.D3E8.7ECB TCP socket:[1] activeLine:0 REGISTERED in SCCP ver 12 and Server in ver 8
mediaActive:0 offhook:0 ringing:0 reset:0 reset_sent:0 paging 0 debug:0 caps:8
IP:10.76.152.2 1025 7960   keepalive 43 max_line 2
 button 1: dn 1  number 5001 CH1   IDLE

ephone-2 Mac:0007.EC32.6B6D TCP socket:[1] activeLine:0 REGISTERED in SCCP ver 12 and Server in ver 8
mediaActive:0 offhook:0 ringing:0 reset:0 reset_sent:0 paging 0 debug:0 caps:8
IP:10.76.152.3 1025 7960   keepalive 43 max_line 2
 button 1: dn 2  number 5002 CH1   IDLE
```

---

## DHCP Bindings

Run: **show ip dhcp binding**

```cisco

IP address       Client-ID/              Lease expiration        Type
                 Hardware address
10.76.128.2      00E0.A3EB.3DE3           --                     Automatic
10.76.128.3      00D0.97EE.67B4           --                     Automatic
10.76.144.2      000B.BEDE.B6C2           --                     Automatic
10.76.144.3      0000.0CD8.76E2           --                     Automatic
10.76.152.2      00D0.D3E8.7ECB           --                     Automatic
10.76.152.3      0007.EC32.6B6D           --                     Automatic

```

---

