package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;

public enum DeploymentStrategyType implements Exportable {
    RollingUpdate,
    Recreate
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
