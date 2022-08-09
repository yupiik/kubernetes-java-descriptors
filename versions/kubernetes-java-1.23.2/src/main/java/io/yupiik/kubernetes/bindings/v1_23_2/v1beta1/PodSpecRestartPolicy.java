package io.yupiik.kubernetes.bindings.v1_23_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;

public enum PodSpecRestartPolicy implements Exportable {
    Never,
    Always,
    OnFailure
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
