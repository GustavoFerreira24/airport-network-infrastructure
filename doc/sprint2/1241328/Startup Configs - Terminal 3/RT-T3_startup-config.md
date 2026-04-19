!
version 15.1
no service timestamps log datetime msec
no service timestamps debug datetime msec
service password-encryption
!
hostname RT-T3
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
license udi pid CISCO2811/K9 sn FTX10174BQI-
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
ip ssh version 1
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
 ip address 10.76.210.2 255.255.255.0
!
interface FastEthernet0/0.805
 encapsulation dot1Q 805
 ip address 10.76.184.1 255.255.252.0
!
interface FastEthernet0/0.806
 encapsulation dot1Q 806
 ip address 10.76.176.1 255.255.248.0
!
interface FastEthernet0/0.807
 encapsulation dot1Q 807
 ip address 10.76.188.1 255.255.254.0
!
interface FastEthernet0/0.808
 encapsulation dot1Q 808
 ip address 10.76.190.1 255.255.255.0
!
interface FastEthernet0/1
 no ip address
 duplex auto
 speed auto
!
interface Vlan1
 no ip address
 shutdown
!
ip classless
ip route 10.76.168.0 255.255.252.0 10.76.210.1 
ip route 10.76.160.0 255.255.248.0 10.76.210.1 
ip route 10.76.172.0 255.255.254.0 10.76.210.1 
ip route 10.76.174.0 255.255.255.128 10.76.210.1 
ip route 10.76.200.0 255.255.252.0 10.76.210.3 
ip route 10.76.192.0 255.255.248.0 10.76.210.3 
ip route 10.76.204.0 255.255.254.0 10.76.210.3 
ip route 10.76.206.0 255.255.255.128 10.76.210.3 
ip route 10.76.144.0 255.255.248.0 10.76.210.4 
ip route 10.76.128.0 255.255.240.0 10.76.210.4 
ip route 10.76.152.0 255.255.254.0 10.76.210.4 
ip route 10.76.154.0 255.255.255.0 10.76.210.4 
!
ip flow-export version 9
!
!
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

