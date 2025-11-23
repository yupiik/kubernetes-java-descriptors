package io.yupiik.kubernetes.bindings.v1_23_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_5.Exportable;

public enum ContainerImagePullPolicy implements Exportable {
    Never,
    IfNotPresent,
    Always
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
