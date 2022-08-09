package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;

public enum ServiceSpecType implements Exportable {
    ClusterIP,
    LoadBalancer,
    ExternalName,
    NodePort
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
