package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

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
