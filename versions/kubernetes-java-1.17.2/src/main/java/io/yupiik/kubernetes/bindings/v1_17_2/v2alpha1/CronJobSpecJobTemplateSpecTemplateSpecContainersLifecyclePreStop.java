package io.yupiik.kubernetes.bindings.v1_17_2.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop {
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                            final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                            final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
