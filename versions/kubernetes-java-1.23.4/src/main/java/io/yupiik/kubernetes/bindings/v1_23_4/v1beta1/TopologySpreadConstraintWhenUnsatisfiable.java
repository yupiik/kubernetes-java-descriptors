package io.yupiik.kubernetes.bindings.v1_23_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

public enum TopologySpreadConstraintWhenUnsatisfiable implements Exportable {
    DoNotSchedule,
    ScheduleAnyway
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
