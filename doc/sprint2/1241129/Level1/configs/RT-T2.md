# <span style="color: #E67E22">RT-T2 Configuration</span>

**Type:** Router (Cisco 2811)  
**Terminal:** T2  
**Role:** Terminal router — inter-VLAN routing, campus backbone, internet connection
---

## <span style="color: #1F4E79">Running Configuration</span>

Run: **show running-config** after running **wr**

```cisco

Current configuration : 2592 bytes
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
!
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
!
interface FastEthernet0/0.801
 encapsulation dot1Q 801
 ip address 10.76.168.1 255.255.252.0
!
interface FastEthernet0/0.802
 encapsulation dot1Q 802
 ip address 10.76.160.1 255.255.248.0
!
interface FastEthernet0/0.803
 encapsulation dot1Q 803
 ip address 10.76.172.1 255.255.254.0
!
interface FastEthernet0/0.804
 encapsulation dot1Q 804
 ip address 10.76.174.1 255.255.255.128
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
ip classless
ip route 0.0.0.0 0.0.0.0 89.73.67.238 
ip route 10.76.176.0 255.255.240.0 10.76.210.2 
ip route 10.76.192.0 255.255.240.0 10.76.210.3 
ip route 10.76.128.0 255.255.224.0 10.76.210.4 
!
ip flow-export version 9
!
!
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

Codes: L - local, C - connected, S - static, R - RIP, M - mobile, B - BGP
       D - EIGRP, EX - EIGRP external, O - OSPF, IA - OSPF inter area
       N1 - OSPF NSSA external type 1, N2 - OSPF NSSA external type 2
       E1 - OSPF external type 1, E2 - OSPF external type 2, E - EGP
       i - IS-IS, L1 - IS-IS level-1, L2 - IS-IS level-2, ia - IS-IS inter area
       * - candidate default, U - per-user static route, o - ODR
       P - periodic downloaded static route

Gateway of last resort is 89.73.67.238 to network 0.0.0.0

     10.0.0.0/8 is variably subnetted, 13 subnets, 8 masks
S       10.76.128.0/19 [1/0] via 10.76.210.4
C       10.76.160.0/21 is directly connected, FastEthernet0/0.802
L       10.76.160.1/32 is directly connected, FastEthernet0/0.802
C       10.76.168.0/22 is directly connected, FastEthernet0/0.801
L       10.76.168.1/32 is directly connected, FastEthernet0/0.801
C       10.76.172.0/23 is directly connected, FastEthernet0/0.803
L       10.76.172.1/32 is directly connected, FastEthernet0/0.803
C       10.76.174.0/25 is directly connected, FastEthernet0/0.804
L       10.76.174.1/32 is directly connected, FastEthernet0/0.804
S       10.76.176.0/20 [1/0] via 10.76.210.2
S       10.76.192.0/20 [1/0] via 10.76.210.3
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

## Notes

- **Backbone IP:** 10.76.210.1/24 (FastEthernet0/0.799)
- **Subinterfaces configured:**
    - Fa0/0.799 → CAMPUS_BACKBONE → 10.76.210.1/24
    - Fa0/0.801 → T2_USERS → 10.76.168.1/22
    - Fa0/0.802 → T2_WIFI → 10.76.160.1/21
    - Fa0/0.803 → T2_VOIP → 10.76.172.1/23
    - Fa0/0.804 → T2_SERVERS → 10.76.174.1/25
- **Static routes configured:**
    - 0.0.0.0/0 via 89.73.67.238 (default route → ISP)
    - 10.76.176.0/20 via 10.76.210.2 (T3)
    - 10.76.192.0/20 via 10.76.210.3 (T4)
    - 10.76.128.0/19 via 10.76.210.4 (T5)
- **WAN IP:** 89.73.67.237/30 (FastEthernet0/1 → ISP-Router)
- **Connected to switch:** IC-L1-T2 via Fa0/0 (trunk)