# Airport Network Infrastructure

Academic group project developed for the **Computer Networks (RCOMP)** course at **ISEP – Polytechnic of Porto**.

The project involved designing and simulating the network infrastructure of a multi-terminal airport, covering structured cabling, switching, routing, network services and security.

## Project Scope

The project was developed across three sprints:

- **Structured Cabling Design** — network outlets, wireless coverage, cable pathways, cross-connects and hardware planning.
- **Layer 2 / Layer 3 Infrastructure** — IPv4 addressing, VLANs, switching, routing and integration between airport terminals.
- **Network Services & Security** — dynamic routing, DHCP, VoIP, DNS, NAT and traffic filtering.

The final infrastructure was simulated and tested using **Cisco Packet Tracer**.

## Technologies & Concepts

- Cisco Packet Tracer
- TCP/IP
- IPv4 Subnetting
- VLANs & Trunking
- VTP
- Inter-VLAN Routing
- OSPF
- DHCP
- DNS
- VoIP
- NAT
- Access Control Lists (ACLs)
- Structured Cabling
- Wireless Network Planning

## My Contribution

This repository is a personal public copy of the original group project. My work focused primarily on the design and implementation of **Terminal 2** throughout the three project sprints.

### Structured Cabling

- Designed the structured cabling infrastructure for the terminal's arrivals and departures floors.
- Planned network outlets, wireless access point coverage, cable pathways and cross-connect infrastructure.
- Estimated the required networking hardware and cabling.

### Network Infrastructure

- Built the Terminal 2 Layer 2 and Layer 3 topology in Cisco Packet Tracer.
- Configured VLANs, IPv4 addressing, trunk links and routing.
- Integrated Terminal 2 with the airport campus backbone and external network connection.

### Network Services & Security

- Migrated routing from static routes to **OSPF**.
- Configured **DHCP** for user, Wi-Fi and VoIP networks.
- Implemented **VoIP** connectivity between airport terminals.
- Configured **DNS** services and domain resolution.
- Implemented **NAT** for HTTP/HTTPS services.
- Applied **ACL-based firewall rules** to control traffic between networks and protect the server/DMZ infrastructure.

## Repository Structure

```text
doc/
├── sprint1/    # Structured cabling design
├── sprint2/    # Layer 2 / Layer 3 network simulation
└── sprint3/    # Network services, OSPF and security
```

Detailed technical documentation, device configurations and Packet Tracer files are available inside each sprint folder.

## Academic Context

This project was developed collaboratively as part of the Computer Networks curriculum at ISEP.

This repository preserves the original project structure, documentation and contributors while providing a public copy for portfolio purposes.