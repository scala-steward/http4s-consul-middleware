package com.dwolla.consul.examples

import cats.effect._
import org.typelevel.log4cats.LoggerFactory
import org.typelevel.log4cats.noop.NoOpFactory

trait ConsulServiceDiscoveryAlgAppPlatform extends IOApp.Simple {
  private implicit val noOpFactory: LoggerFactory[IO] = NoOpFactory[IO]

  override def run: IO[Unit] = new ConsulServiceDiscoveryAlgApp[IO].run
}
