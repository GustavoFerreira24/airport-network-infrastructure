RCOMP 2025-2026 Project 1 - Sprint 2 review
=========================================
### Sprint master: 1241129 ###

# 1. Sprint's backlog #

The goal of Sprint 2 was to create a **Cisco Packet Tracer network simulation** based on the structured cabling project developed in Sprint 1.

This sprint focused on:

- **Layer 2 infrastructure**
- **VLAN definition and propagation**
- **Layer 3 fundamentals**
- **IPv4 addressing**
- **Static routing**

Each team member continued working on the same terminal assigned in Sprint 1. Each individual simulation had to include:

- the member's own terminal
- the **campus backbone**
- a switch representing the **main cross-connect**
- switches representing the other terminals in the backbone structure

For this team, the sprint backlog included:

- **T.2.1** – Development of a layer two and layer three Packet Tracer simulation for **Terminal 2**, the campus backbone, and the internet connection
- **T.2.2** – Development of a layer two and layer three Packet Tracer simulation for **Terminal 3**, the campus backbone, and integration of all members' simulations into a single **campus.pkt**
- **T.2.3** – Development of a layer two and layer three Packet Tracer simulation for **Terminal 5** and the campus backbone
- **T.2.4** – Development of a layer two and layer three Packet Tracer simulation for **Terminal 4** and the campus backbone

Main outputs required for each member:

- the corresponding Packet Tracer simulation file (`TerminalN.pkt`)
- a document explaining the adopted **IPv4 addressing** and **static routing**
- configuration dump files for **all switches and routers** in the member's terminal

For Terminal 3, there was one additional required output:

- the integrated simulation file **`campus.pkt`**

During the review, the team verified the existence of the members' documentation, the expected Packet Tracer simulations, the exported configurations, the use of the common VLAN/VTP/IP planning, and the readiness of each terminal for integration.

# 2. Subtasks assessment #

One by one, each team member presented his outcomes to the team, and the team assessed the accomplishment of the subtask backlog.

The subtask backlog accomplishment can be assessed as one of:

* Totally implemented with no issues
* Totally implemented with issues
* Partially implemented with no issues
* Partially implemented with issues

For the last three cases, a text description of what has not been implemented and present issues must be added. Unimplemented features and issues solving is assigned to the same member on the next sprint.

## 2.1. 1241129 - Network simulation for Terminal 2 #
### Totally implemented with no issues. ###

The Terminal 2 simulation and documentation were delivered. The folder includes the `Terminal2.pkt` Packet Tracer simulation, documentation for Level 1 and Level 4, device access credentials, IPv4 addressing summary, static routing table, internet connection information, and VTP domain information.

The implementation follows the team planning decisions:

- Cisco Packet Tracer simulation for Terminal 2
- VLANs and VTP domain `rc2526dig4`
- router-on-a-stick configuration using the planned IPv4 gateways
- static routes to the remaining terminal blocks
- internet connection through the ISP router
- ISP static route back to the team address block `10.76.128.0/17`

No blocking issues were identified during the sprint review.

## 2.2. 1241328 - Network simulation for Terminal 3 and campus integration #
### Totally implemented with no issues. ###

The Terminal 3 simulation and documentation were delivered. The folder includes the Terminal 3 Packet Tracer work, the description of the hierarchical architecture, the full shared VLAN database, Layer 2 configuration notes, router-on-a-stick subinterfaces, static routing, Switches DMZ addressing, end-device addressing, and the additional campus integration task.

The implementation follows the team planning decisions:

- Cisco Packet Tracer simulation for Terminal 3
- shared VLAN database with VLANs 799 to 816
- VTP domain `rc2526dig4`
- Cisco 2811 router used for inter-VLAN routing
- static routes to Terminal 2, Terminal 4 and Terminal 5 networks through the Campus Backbone
- Switches DMZ addresses assigned from `10.76.209.64/28`
- integration of all terminal simulations into `campus.pkt`

No blocking issues were identified during the sprint review.

## 2.3. 1241039 - Network simulation for Terminal 5 #
### Totally implemented with no issues. ###

The Terminal 5 simulation and documentation were delivered. The folder includes the Terminal 5 Packet Tracer work, the implemented Layer 2 and Layer 3 architecture, VLAN structure, trunk/access port decisions, STP/VTP information, router-on-a-stick gateway addressing, static routing description, representative end devices and management network information.

The implementation follows the team planning decisions:

- Cisco Packet Tracer simulation for Terminal 5
- VLANs 799, 800 and 813 to 816 used according to the team VLAN plan
- VTP domain `rc2526dig4`
- Cisco 2811 router used for inter-VLAN routing
- static routing configured according to the global addressing plan
- Switches DMZ implemented as a dedicated management network
- representative end devices added for validation

No blocking issues were identified during the sprint review.

## 2.4. 1240901 - Network simulation for Terminal 4 #
### Totally implemented with no issues. ###

The Terminal 4 simulation and documentation were delivered. The folder includes the Terminal 4 Packet Tracer work, Level 0 and Level 2 documentation, exported startup configurations for router, IC, HC and CP devices, VLAN structure, Layer 2 configuration, Layer 3 configuration, static routing description and representative end devices.

The implementation follows the team planning decisions:

- Cisco Packet Tracer simulation for Terminal 4
- VLANs 800 and 809 to 812 used according to the team VLAN plan
- VTP domain `rc2526dig4`
- Cisco 2811 router used for inter-VLAN routing
- router-on-a-stick gateway addressing for the Terminal 4 networks
- static routes prepared according to the global addressing plan
- exported configuration files included for the relevant network devices
- representative end devices added for validation

No blocking issues were identified during the sprint review.

# 3. Global sprint review #

The team considers Sprint 2 completed successfully. The main technical requirements defined in the sprint statement and in the team planning were implemented:

- every terminal has a logical Cisco Packet Tracer simulation based on the Sprint 1 structured cabling design
- the shared VLAN database was adopted across the project
- VTP was used with the common domain `rc2526dig4`
- STP was kept enabled on the switching infrastructure
- the planned IPv4 addressing scheme was applied
- router-on-a-stick was used for inter-VLAN routing
- static routing was configured or prepared according to the global addressing plan
- the Switches DMZ was implemented for switch management
- representative end devices were placed in the required VLANs
- the Terminal 3 member completed the integration task into `campus.pkt`

# 4. Work transferred to next sprint #

No incomplete or unsatisfactorily implemented Sprint 2 task was identified during the review.

The following work naturally continues in Sprint 3, according to the project statement:

- replacement of static routing with dynamic routing
- DHCP services
- VoIP services and phone addressing
- DNS and HTTP services
- traffic filtering/access control rules
- NAT configuration for the required services

# 5. Final remarks #

The Sprint 2 outcomes provide a consistent base for Sprint 3. The team should continue using the same addressing plan, VLAN identifiers, VTP domain and device naming conventions to avoid integration problems when adding dynamic routing, services, access policies and NAT.