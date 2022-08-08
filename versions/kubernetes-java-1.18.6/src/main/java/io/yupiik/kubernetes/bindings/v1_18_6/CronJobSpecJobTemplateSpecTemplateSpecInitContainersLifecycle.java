package io.yupiik.kubernetes.bindings.v1_18_6;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecycle {
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecycle(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                                         final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecycle __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
