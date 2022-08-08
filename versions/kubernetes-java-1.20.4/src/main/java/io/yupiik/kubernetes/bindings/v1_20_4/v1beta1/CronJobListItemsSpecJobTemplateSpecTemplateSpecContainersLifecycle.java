package io.yupiik.kubernetes.bindings.v1_20_4.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecycle {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart postStart;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop preStop;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecycle(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecycle __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
