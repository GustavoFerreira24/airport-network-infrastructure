# MC-Campus Configuration

**Type:** Switch  
**Terminal:** T2  
**Level:** L1  
**VTP Mode:** [server/client]  
**Management IP:** 10.76.208.XXX

---

## Running Configuration

Run: **show running-config**

```cisco

Current configuration : 1030 bytes
!
version 12.1
no service timestamps log datetime msec
no service timestamps debug datetime msec
no service password-encryption
!
hostname MC-Campus
!
!
!
ptp clock transparent domain 0 profile default
ip ssh version 2
ip domain-name rc2526dig4
!
username admin secret 5 $1$mERr$hx5rVt7rPNoS4wqbXKX7m0
!
!
!
spanning-tree mode pvst
spanning-tree extend system-id
!
interface FastEthernet0/1
 description Connection to IC-L1-T2
 switchport trunk allowed vlan 799-816
 switchport mode trunk
!
interface FastEthernet1/1
 description Connection to IC-T3
 switchport trunk allowed vlan 799-816
 switchport mode trunk
!
interface FastEthernet2/1
 description Connection to IC-T4
 switchport trunk allowed vlan 799-816
 switchport mode trunk
!
interface FastEthernet3/1
 description Connection to IC-T5
 switchport trunk allowed vlan 799-816
 switchport mode trunk
!
interface Vlan1
 no ip address
 shutdown
!
!
!
!
line con 0
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
!
end

```

---

## VTP Status

Run: **show vtp status**

```cisco

VTP Version                     : 1
Configuration Revision          : 73
Maximum VLANs supported locally : 255
Number of existing VLANs        : 23
VTP Operating Mode              : Server
VTP Domain Name                 : rc2526dig4
VTP Pruning Mode                : Disabled
VTP V2 Mode                     : Disabled
VTP Traps Generation            : Disabled
MD5 digest                      : 0x40 0x42 0x5A 0xAE 0x11 0x97 0x96 0x94 
Configuration last modified by 10.76.208.129 at 3-4-93 00:42:41
Local updater ID is 0.0.0.0 (no valid interface found)

```

---

## VLAN Database

Run: **show vlan brief**

```cisco

VLAN Name                             Status    Ports
---- -------------------------------- --------- -------------------------------
1    default                          active    
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
814  T5_WIFI                          active    
815  T5_VOIP                          active    
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
Fa0/1       on           802.1q         trunking      1
Fa1/1       on           802.1q         trunking      1
Fa2/1       on           802.1q         trunking      1
Fa3/1       on           802.1q         trunking      1

Port        Vlans allowed on trunk
Fa0/1       799-816
Fa1/1       799-816
Fa2/1       799-816
Fa3/1       799-816

Port        Vlans allowed and active in management domain
Fa0/1       799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816
Fa1/1       799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816
Fa2/1       799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816
Fa3/1       799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816

Port        Vlans in spanning tree forwarding state and not pruned
Fa0/1       799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816
Fa1/1       799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816
Fa2/1       799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816
Fa3/1       799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816

```

---

## IP Interfaces

Run: **show ip interface brief**

```cisco

Interface              IP-Address      OK? Method Status                Protocol 
FastEthernet0/1        unassigned      YES manual up                    up 
FastEthernet1/1        unassigned      YES manual up                    up 
FastEthernet2/1        unassigned      YES manual up                    up 
FastEthernet3/1        unassigned      YES manual up                    up 
Vlan1                  unassigned      YES manual administratively down down

```

---


## Startup Config

Run: **copy running-config startup-config** (save first), then **show startup-config**

```cisco

PASTE HERE

```

---

## Notes

- **Management IP:** 10.76.208.XXX
- **Uplinks (trunk):**
- **Access ports (data):**
- **Voice ports:**
- **Wi-Fi ports:**
- **DMZ management port:**