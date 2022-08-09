package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;

public enum ServiceSpecSessionAffinity implements Exportable {
    ClientIP,
    None
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
