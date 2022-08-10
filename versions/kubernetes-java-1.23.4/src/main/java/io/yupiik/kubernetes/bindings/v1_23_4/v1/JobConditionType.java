package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

public enum JobConditionType implements Exportable {
    Complete,
    Failed,
    Suspended
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}