package io.yupiik.kubernetes.bindings.v1_21_2.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                                       final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                                       final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
