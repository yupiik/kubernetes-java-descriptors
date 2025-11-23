package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

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
