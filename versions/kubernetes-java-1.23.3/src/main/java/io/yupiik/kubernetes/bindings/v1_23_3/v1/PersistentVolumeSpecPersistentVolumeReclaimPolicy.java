package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;

public enum PersistentVolumeSpecPersistentVolumeReclaimPolicy implements Exportable {
    Delete,
    Recycle,
    Retain
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
