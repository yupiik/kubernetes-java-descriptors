package io.yupiik.kubernetes.bindings.v1_23_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_5.Exportable;

public enum TolerationEffect implements Exportable {
    PreferNoSchedule,
    NoSchedule,
    NoExecute
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
