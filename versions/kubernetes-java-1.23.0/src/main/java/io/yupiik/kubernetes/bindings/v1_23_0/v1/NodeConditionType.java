package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import io.yupiik.kubernetes.bindings.v1_23_0.Exportable;

public enum NodeConditionType implements Exportable {
    Ready,
    NetworkUnavailable,
    DiskPressure,
    MemoryPressure,
    PIDPressure
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
