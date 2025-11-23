package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import io.yupiik.kubernetes.bindings.v1_23_1.Exportable;

public enum PodConditionType implements Exportable {
    Ready,
    Initialized,
    PodScheduled,
    ContainersReady
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
