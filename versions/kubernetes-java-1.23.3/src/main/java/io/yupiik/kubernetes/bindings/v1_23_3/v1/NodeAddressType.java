package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;

public enum NodeAddressType implements Exportable {
    ExternalDNS,
    ExternalIP,
    Hostname,
    InternalIP,
    InternalDNS
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
