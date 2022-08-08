package io.yupiik.kubernetes.bindings.v1_18_7.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                                     final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                                     final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
