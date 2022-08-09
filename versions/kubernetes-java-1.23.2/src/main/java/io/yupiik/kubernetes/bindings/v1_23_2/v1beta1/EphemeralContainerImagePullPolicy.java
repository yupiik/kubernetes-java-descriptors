package io.yupiik.kubernetes.bindings.v1_23_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;

public enum EphemeralContainerImagePullPolicy implements Exportable {
    Never,
    IfNotPresent,
    Always
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
