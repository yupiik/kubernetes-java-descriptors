package io.yupiik.kubernetes.bindings.v1_23_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

public enum ContainerPortProtocol implements Exportable {
    TCP,
    UDP,
    SCTP
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
