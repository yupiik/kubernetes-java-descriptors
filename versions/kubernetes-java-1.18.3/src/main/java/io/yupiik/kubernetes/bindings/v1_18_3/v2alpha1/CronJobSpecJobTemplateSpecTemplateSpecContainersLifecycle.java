package io.yupiik.kubernetes.bindings.v1_18_3.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle {
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart postStart;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop preStop;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                                     final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop preStop) {
        this.preStop = preStop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                postStart,
                preStop);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
