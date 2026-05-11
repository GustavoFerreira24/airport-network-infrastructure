# <span style="color: #E67E22">SRV2-L1-T2 Configuration</span>

**Type:** Server  
**Terminal:** T2  
**Level:** L1  
**VLAN:** T2_SERVERS (804)

---

## <span style="color: #1F4E79">IP Configuration</span>

| Field           | Value           |
|-----------------|-----------------|
| IPv4 Address    | 10.76.174.3     |
| Subnet Mask     | 255.255.255.128 |
| Default Gateway | 10.76.174.1     |
| DNS Server      | 10.76.174.3     |

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

| Type  | Name                            | Value                           |
|-------|---------------------------------|---------------------------------|
| A     | ns.rcomp-25-26-DI-G4            | 10.76.174.3                     |
| A     | server1.rcomp-25-26-DI-G4       | 10.76.174.2                     |
| CNAME | www.rcomp-25-26-DI-G4           | server1.rcomp-25-26-DI-G4       |
| CNAME | web.rcomp-25-26-DI-G4           | server1.rcomp-25-26-DI-G4       |
| CNAME | dns.rcomp-25-26-DI-G4           | ns.rcomp-25-26-DI-G4            |
| NS    | terminal-3.rcomp-25-26-DI-G4    | ns.terminal-3.rcomp-25-26-DI-G4 |
| A     | ns.terminal-3.rcomp-25-26-DI-G4 | 10.76.190.3                     |
| NS    | terminal-4.rcomp-25-26-DI-G4    | ns.terminal-4.rcomp-25-26-DI-G4 |
| A     | ns.terminal-4.rcomp-25-26-DI-G4 | 10.76.206.3                     |
| NS    | terminal-5.rcomp-25-26-DI-G4    | ns.terminal-5.rcomp-25-26-DI-G4 |
| A     | ns.terminal-5.rcomp-25-26-DI-G4 | 10.76.154.3                     |

---

## Notes

- **Connected to switch:** CP1-L1-T2
- **Switch port:** FastEthernet3/1
- **Switch port mode:** access
- **VLAN assigned:** 804 (T2_SERVERS)
- **Gateway:** 10.76.174.1
- **DNS name:** ns.rcomp-25-26-DI-G4
- **HTTP page:** identifies Terminal 2, Group 4, 2DI
- **NAT:** Receives HTTP/HTTPS traffic redirected from the backbone (10.76.210.1)