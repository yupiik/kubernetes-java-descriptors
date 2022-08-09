package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;

public enum ServicePortProtocol implements Exportable {
    TCP,
    UDP,
    SCTP
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
