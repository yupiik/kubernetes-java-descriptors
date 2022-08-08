package io.yupiik.kubernetes.bindings.v1_20_13.v2alpha1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                                                final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                                                final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
