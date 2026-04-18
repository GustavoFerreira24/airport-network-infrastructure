# [HOSTNAME] Configuration

**Type:** Router (Cisco 2811)  
**Terminal:** T2  
**Role:** Terminal router / inter-VLAN routing + campus backbone

---

## Running Configuration

Run: **show running-config**

```cisco

Current configuration : 1260 bytes
!
version 15.1
no service timestamps log datetime msec
no service timestamps debug datetime msec
no service password-encryption
!
hostname RT-T2
!
!
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
 no ip address
 duplex auto
 speed auto
 shutdown
!
interface Vlan1
 no ip address
 shutdown
!
ip classless
!
ip flow-export version 9
!
!
!
!
!
!
!
line con 0
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

Gateway of last resort is not set

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
FastEthernet0/1        unassigned      YES unset  administratively down down 
Vlan1                  unassigned      YES unset  administratively down down

```

---


## Startup Config

Run: **copy running-config startup-config** (save first), then **show startup-config**

```cisco

PASTE HERE

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
- **Connected to switch:** IC-L1-T2 via Fa0/0 (trunk)