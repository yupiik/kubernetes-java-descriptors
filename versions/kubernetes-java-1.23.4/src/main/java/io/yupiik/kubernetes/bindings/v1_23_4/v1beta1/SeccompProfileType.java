package io.yupiik.kubernetes.bindings.v1_23_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

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
