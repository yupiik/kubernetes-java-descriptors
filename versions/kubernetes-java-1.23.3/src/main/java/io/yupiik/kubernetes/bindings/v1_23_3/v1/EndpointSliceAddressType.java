package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;

public enum EndpointSliceAddressType implements Exportable {
    FQDN,
    IPv6,
    IPv4
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
