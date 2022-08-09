package io.yupiik.kubernetes.bindings.v1_23_4.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

public enum TolerationOperator implements Exportable {
    Equal,
    Exists
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
