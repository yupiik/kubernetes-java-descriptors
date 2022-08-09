package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import io.yupiik.kubernetes.bindings.v1_23_0.Exportable;

public enum SeccompProfileType implements Exportable {
    RuntimeDefault,
    Localhost,
    Unconfined
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
