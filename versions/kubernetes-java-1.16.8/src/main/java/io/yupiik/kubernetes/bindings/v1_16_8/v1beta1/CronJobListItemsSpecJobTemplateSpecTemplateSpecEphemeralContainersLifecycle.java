package io.yupiik.kubernetes.bindings.v1_16_8.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                                       final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
