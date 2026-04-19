# <span style="color: #E67E22">RT-T5 Configuration</span>

**Type:** Router (Cisco 2811)  
**Terminal:** T5  
---

## <span style="color: #1F4E79">Running Configuration</span>

Run: **show running-config** after running **wr**

```cisco

Current configuration : 2504 bytes
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
interface FastEthernet0/0.800
 encapsulation dot1Q 800
 ip address 10.76.208.126 255.255.255.128
!
interface FastEthernet0/0.813
 encapsulation dot1Q 813
 ip address 10.76.144.1 255.255.248.0
!
interface FastEthernet0/0.814
 encapsulation dot1Q 814
 ip address 10.76.128.1 255.255.240.0
!
interface FastEthernet0/0.815
 encapsulation dot1Q 815
 ip address 10.76.152.1 255.255.254.0
!
interface FastEthernet0/0.816
 encapsulation dot1Q 816
 ip address 10.76.154.1 255.255.255.0
!
interface FastEthernet0/1
 ip address 10.76.210.4 255.255.255.0
 duplex auto
 speed auto
!
interface Vlan1
 no ip address
 shutdown
!
ip classless
ip route 10.76.160.0 255.255.240.0 10.76.210.1 
ip route 10.76.176.0 255.255.240.0 10.76.210.2 
ip route 10.76.192.0 255.255.240.0 10.76.210.3 
ip route 0.0.0.0 0.0.0.0 10.76.210.1 
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

     10.0.0.0/8 is variably subnetted, 10 subnets, 5 masks
C       10.76.128.0/20 is directly connected, FastEthernet0/0.814
L       10.76.128.1/32 is directly connected, FastEthernet0/0.814
C       10.76.144.0/21 is directly connected, FastEthernet0/0.813
L       10.76.144.1/32 is directly connected, FastEthernet0/0.813
C       10.76.152.0/23 is directly connected, FastEthernet0/0.815
L       10.76.152.1/32 is directly connected, FastEthernet0/0.815
C       10.76.154.0/24 is directly connected, FastEthernet0/0.816
L       10.76.154.1/32 is directly connected, FastEthernet0/0.816
C       10.76.208.0/23 is directly connected, FastEthernet0/0.800
L       10.76.208.126/32 is directly connected, FastEthernet0/0.800
```

---

## IP Interfaces

Run: **show ip interface brief**

```cisco

Interface              IP-Address      OK? Method Status                Protocol 
FastEthernet0/0        unassigned      YES unset  up                    up 
FastEthernet0/0.800    10.76.208.126     YES manual up                    up 
FastEthernet0/0.813    10.76.144.1     YES manual up                    up 
FastEthernet0/0.814    10.76.128.1     YES manual up                    up 
FastEthernet0/0.815    10.76.152.1     YES manual up                    up 
FastEthernet0/0.816    10.76.154.1     YES manual up                    up 
FastEthernet0/1        10.76.210.4     YES manual down                  down 
Vlan1                  unassigned      YES unset  administratively down down
```


---
