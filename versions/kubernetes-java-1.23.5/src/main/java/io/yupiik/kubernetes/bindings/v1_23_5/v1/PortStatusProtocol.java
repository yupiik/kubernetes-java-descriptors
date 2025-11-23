package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import io.yupiik.kubernetes.bindings.v1_23_5.Exportable;

public enum PortStatusProtocol implements Exportable {
    TCP,
    UDP,
    SCTP
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
