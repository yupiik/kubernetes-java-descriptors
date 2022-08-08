package io.yupiik.kubernetes.bindings.v1_18_2.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                                     final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                                     final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
