package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import io.yupiik.kubernetes.bindings.v1_23_5.Exportable;

public enum DaemonSetUpdateStrategyType implements Exportable {
    RollingUpdate,
    OnDelete
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
