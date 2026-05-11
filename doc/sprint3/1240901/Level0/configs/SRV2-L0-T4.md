# <span style="color: #E67E22">SRV2-L0-T4 Configuration</span>

**Type:** Server  
**Terminal:** T4  
**Level:** L0  
**VLAN:** T4_SERVERS (812)

---

## <span style="color: #1F4E79">IP Configuration</span>

| Field           | Value           |
|-----------------|-----------------|
| IPv4 Address    | 10.76.206.3     |
| Subnet Mask     | 255.255.255.128 |
| Default Gateway | 10.76.206.1     |
| DNS Server      | 10.76.206.3     |


---

## <span style="color: #1F4E79">Services Active</span>

| Service | Status                       |
|---------|------------------------------|
| HTTP    | On                           |
| HTTPS   | On                           |
| DNS     | On                           |
| DHCP    | Off (static addressing used) |
| FTP     | Off                          |

---

## <span style="color: #1F4E79">DNS Records</span>

| Type  | Name                                       | Value                                      |
|-------|--------------------------------------------|--------------------------------------------|
| A     | ns.terminal-4.rcomp-25-26-DI-G4            | 10.76.206.3                                |
| A     | server1.terminal-4.rcomp-25-26-DI-G4       | 10.76.206.10                               |
| A     | server2.terminal-4.rcomp-25-26-DI-G4       | 10.76.206.3                                |
| CNAME | www.terminal-4.rcomp-25-26-DI-G4           | server1.terminal-4.rcomp-25-26-DI-G4       |
| CNAME | web.terminal-4.rcomp-25-26-DI-G4           | server1.terminal-4.rcomp-25-26-DI-G4       |
| CNAME | dns.terminal-4.rcomp-25-26-DI-G4           | ns.terminal-4.rcomp-25-26-DI-G4            |
| NS    | rcomp-25-26-DI-G4                          | ns.rcomp-25-26-DI-G4                       |
| A     | ns.rcomp-25-26-DI-G4                       | 10.76.174.3                                |

---

## Notes

- **Connected to switch:** CP3-L0-T4
- **Switch port:** FastEthernet5/1
- **Switch port mode:** access
- **VLAN assigned:** 812 (T4_SERVERS)
- **Gateway:** 10.76.206.1
- **DNS name:** ns.terminal-4.rcomp-25-26-DI-G4
- **HTTP page:** identifies Terminal 4, Group 4, 2DI
- **NAT:** Receives HTTP/HTTPS traffic redirected from the backbone (10.76.210.3)