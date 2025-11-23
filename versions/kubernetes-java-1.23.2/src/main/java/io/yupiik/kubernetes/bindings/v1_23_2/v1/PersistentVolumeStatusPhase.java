package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;

public enum PersistentVolumeStatusPhase implements Exportable {
    Released,
    Failed,
    Bound,
    Available,
    Pending
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
