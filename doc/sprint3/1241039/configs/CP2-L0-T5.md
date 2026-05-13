# <span style="color: #E67E22">CP2-L0-T5 Configuration</span>


## <span style="color: #1F4E79">Running Configuration</span>

Run: **show running-config** after running **wr**

```cisco

!
version 12.1
no service timestamps log datetime msec
no service timestamps debug datetime msec
service password-encryption
!
hostname CP2-L0-T5
!
enable secret 5 $1$mERr$UIEd/gKB8Xu9v11aSkZ1n0
!
!
!
ptp clock transparent domain 0 profile default
!
username cisco secret 5 $1$mERr$UIEd/gKB8Xu9v11aSkZ1n0
!
!
!
spanning-tree mode pvst
spanning-tree extend system-id
!
interface FastEthernet7/1
 switchport mode access
 switchport voice vlan 815
 spanning-tree portfast
!
interface FastEthernet8/1
 switchport access vlan 814
 switchport mode access
!
interface FastEthernet9/1
 switchport mode trunk
!
interface Vlan1
 no ip address
 shutdown
!
interface Vlan800
 ip address 10.76.208.5 255.255.254.0
!
ip default-gateway 10.76.208.1
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
line con 0
 login local
!
line vty 0 4
 login local
 transport input ssh
line vty 5 15
 login
!
!
!
!
end



```

---

## VTP Status

Run: **show vtp status**

```cisco

VTP Version                     : 1
Configuration Revision          : 290
Maximum VLANs supported locally : 255
Number of existing VLANs        : 23
VTP Operating Mode              : Server
VTP Domain Name                 : rc2526dig4
VTP Pruning Mode                : Disabled
VTP V2 Mode                     : Disabled
VTP Traps Generation            : Disabled
MD5 digest                      : 0x75 0x45 0x96 0x37 0x65 0xBE 0x32 0x1A 
Configuration last modified by 0.0.0.0 at 3-1-93 13:22:02
Local updater ID is 10.76.208.5 on interface Vl800 (lowest numbered VLAN interface found)
```

---

## VLAN Database

Run: **show vlan brief**

```cisco


VLAN Name                             Status    Ports
---- -------------------------------- --------- -------------------------------
1    default                          active    Fa7/1
799  CAMPUS_BACKBONE                  active    
800  SWITCHES_DMZ                     active    
801  T2_USERS                         active    
802  T2_WIFI                          active    
803  T2_VOIP                          active    
804  T2_SERVERS                       active    
805  T3_USERS                         active    
806  T3_WIFI                          active    
807  T3_VOIP                          active    
808  T3_SERVERS                       active    
809  T4_USERS                         active    
810  T4_WIFI                          active    
811  T4_VOIP                          active    
812  T4_SERVERS                       active    
813  T5_USERS                         active    
814  T5_WIFI                          active    Fa8/1
815  T5_VOIP                          active    Fa7/1
816  T5_SERVERS                       active    
1002 fddi-default                     active    
1003 token-ring-default               active    
1004 fddinet-default                  active    
1005 trnet-default                    active  
```

---

## Trunk Interfaces

Run: **show interfaces trunk**

```cisco

Port        Mode         Encapsulation  Status        Native vlan
Fa9/1       on           802.1q         trunking      1

Port        Vlans allowed on trunk
Fa9/1       1-1005

Port        Vlans allowed and active in management domain
Fa9/1       1,799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816

Port        Vlans in spanning tree forwarding state and not pruned
Fa9/1       1,799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816
```

---

## IP Interfaces

Run: **show ip interface brief**

```cisco

Interface              IP-Address      OK? Method Status                Protocol 
FastEthernet7/1        unassigned      YES manual up                    up 
FastEthernet8/1        unassigned      YES manual up                    up 
FastEthernet9/1        unassigned      YES manual up                    up 
Vlan1                  unassigned      YES manual administratively down down 
Vlan800                10.76.208.5     YES manual up                    up
```

---
