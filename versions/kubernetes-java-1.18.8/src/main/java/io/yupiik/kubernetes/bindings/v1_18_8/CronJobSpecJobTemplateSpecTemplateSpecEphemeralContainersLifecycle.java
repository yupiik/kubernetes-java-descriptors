package io.yupiik.kubernetes.bindings.v1_18_8;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle {
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                              final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
