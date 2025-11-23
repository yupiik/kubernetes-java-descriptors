package io.yupiik.kubernetes.bindings.v1_23_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_1.Exportable;

public enum TopologySpreadConstraintWhenUnsatisfiable implements Exportable {
    DoNotSchedule,
    ScheduleAnyway
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
