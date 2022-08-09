package io.yupiik.kubernetes.bindings.v1_23_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;

public enum PodSpecDnsPolicy implements Exportable {
    ClusterFirstWithHostNet,
    ClusterFirst,
    Default,
    None
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
