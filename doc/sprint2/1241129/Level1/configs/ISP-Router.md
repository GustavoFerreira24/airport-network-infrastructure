# <span style="color: #E67E22">ISP-Router Configuration</span>

**Type:** Router (Cisco 2811)  
**Role:** ISP Router — forwards traffic to team address block
---

## <span style="color: #1F4E79">Running Configuration</span>

Run: **show running-config** after running **wr**

```cisco

Current configuration : 1829 bytes
!
version 15.1
no service timestamps log datetime msec
no service timestamps debug datetime msec
service password-encryption
!
hostname ISP-Router
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
!
license udi pid CISCO2811/K9 sn FTX1017DH3C-
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
 ip address 89.73.67.238 255.255.255.252
 duplex auto
 speed auto
!
interface FastEthernet0/1
 no ip address
 duplex auto
 speed auto
 shutdown
!
interface Serial0/2/0
 no ip address
 clock rate 2000000
!
interface Vlan1
 no ip address
 shutdown
!
ip classless
ip route 10.76.128.0 255.255.128.0 89.73.67.237 
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
 login
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

     10.0.0.0/17 is subnetted, 1 subnets
S       10.76.128.0/17 [1/0] via 89.73.67.237
     89.0.0.0/8 is variably subnetted, 2 subnets, 2 masks
C       89.73.67.236/30 is directly connected, FastEthernet0/0
L       89.73.67.238/32 is directly connected, FastEthernet0/0

```

---

## IP Interfaces

Run: **show ip interface brief**

```cisco

Interface              IP-Address      OK? Method Status                Protocol 
FastEthernet0/0        89.73.67.238    YES NVRAM  up                    up 
FastEthernet0/1        unassigned      YES NVRAM  administratively down down 
Serial0/2/0            unassigned      YES unset  down                  down 
Vlan1                  unassigned      YES NVRAM  administratively down down

```

---

## Notes

- **WAN IP:** 89.73.67.238/30 (FastEthernet0/0)
- **Connected to:** DSL Modem → Cloud → RT-T2 (89.73.67.237)
- **Static route:** 10.76.128.0/17 via 89.73.67.237