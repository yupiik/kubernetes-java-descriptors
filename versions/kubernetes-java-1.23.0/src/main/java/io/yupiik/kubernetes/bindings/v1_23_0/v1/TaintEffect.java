package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import io.yupiik.kubernetes.bindings.v1_23_0.Exportable;

public enum TaintEffect implements Exportable {
    PreferNoSchedule,
    NoSchedule,
    NoExecute
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
