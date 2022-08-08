package io.yupiik.kubernetes.bindings.v1_18_9;

import java.util.Objects;

public class DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                         final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                         final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
