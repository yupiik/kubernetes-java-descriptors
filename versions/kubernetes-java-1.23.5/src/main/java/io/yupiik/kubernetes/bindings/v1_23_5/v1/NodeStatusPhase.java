package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import io.yupiik.kubernetes.bindings.v1_23_5.Exportable;

public enum NodeStatusPhase implements Exportable {
    Running,
    Terminated,
    Pending
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
