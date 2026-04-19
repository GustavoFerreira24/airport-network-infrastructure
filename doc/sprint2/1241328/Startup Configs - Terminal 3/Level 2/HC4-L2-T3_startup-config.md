!
version 12.1
no service timestamps log datetime msec
no service timestamps debug datetime msec
service password-encryption
!
hostname HC4-L2-T3
!
enable secret 5 $1$mERr$UIEd/gKB8Xu9v11aSkZ1n0
!
!
!
ptp clock transparent domain 0 profile default
!
!
!
spanning-tree mode pvst
spanning-tree extend system-id
!
interface FastEthernet0/1
 switchport mode trunk
!
interface FastEthernet1/1
 switchport mode trunk
!
interface FastEthernet2/1
 switchport access vlan 806
 switchport mode access
!
interface Vlan1
 no ip address
 shutdown
!
interface Vlan800
 ip address 10.76.209.74 255.255.255.240
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
 login
line vty 5 15
 login
!
!
!
!
end

