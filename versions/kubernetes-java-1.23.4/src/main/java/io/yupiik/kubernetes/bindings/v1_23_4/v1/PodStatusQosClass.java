package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

public enum PodStatusQosClass implements Exportable {
    BestEffort,
    Burstable,
    Guaranteed
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
